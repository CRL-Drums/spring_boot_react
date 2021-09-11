import Footer from "components/Footer";
import NavBar from "components/NavBar";

function Home() {
    return (
        <>
            <NavBar />
            <br />
            <br />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">CRL Vendas</h1>
                    <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                </div>
            </div>
            <Footer />
        </>
    );
}
export default Home;