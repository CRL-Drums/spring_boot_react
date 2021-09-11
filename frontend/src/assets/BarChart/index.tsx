import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts'
import { SaleSuccess } from 'types/sale';
import { round } from 'utils/format';
import { BASE_URL } from 'utils/requests';


type SeriesData = {
    name: string
    data: number[]
};

type ChartData = {
    labels: {
        categories: string[]
    }
    series: SeriesData[]
};

function BarChart() {

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
             categories: []
         },
         series: []
     })

     useEffect(() => {
        axios.get(`${BASE_URL}/sales/success-by-seller`)
            .then(response => {
                const data = response.data as SaleSuccess[];
                const dataLabels = data.map(x => x.sellerName);
                const dataSeries = data.map(x => round(100.0 * x.deals / x.visited, 1));

                setChartData({ labels: {
                    categories: dataLabels
                },
                series: [
                    {
                        name: "% Success",
                        data: dataSeries
                    }
                ]
            });
                console.log(chartData);
            });
    }, []);

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    
    return (
        <Chart 
            options={{ ...options, xaxis: chartData.labels}}
            series={chartData.series}
            type="bar"
            height="240"
        />
    )
  };
  
  export default BarChart;