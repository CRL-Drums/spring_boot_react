import BarChart from "assets/BarChart";
import DonutChart from "assets/DonutChart";
import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function Dashboard() {
    return (
        <>
            <NavBar />
            <div className="container">
                <br />
                <h1 className="text-primary py-3">Nhaew!</h1>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Total</h5>
                        <DonutChart />
                    </div>
                </div>
                <div className="py=3">
                    <h2 className="text-primary">Todas as Vendas</h2>
                </div>
                <DataTable />
            </div>
            <Footer />
        </>
    );
}
export default Dashboard;