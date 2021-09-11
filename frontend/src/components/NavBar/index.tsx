
/* eslint-disable jsx-a11y/anchor-is-valid */
function NavBar() {
  return (
    <nav className="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
      <a className="navbar-brand" href="/">&nbsp; &nbsp;Cláudio's App </a>
      <ul className="navbar-nav">
        <li className="nav-item">
          <a className="nav-link" href="/dashboard">Dashboard</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="https://www.linkedin.com/in/claudio-lima-101/" target="_blank" rel="noreferrer">Linkedin</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="https://github.com/CRL-Drums" target="_blank" rel="noreferrer">Github</a>
        </li>
      </ul>
    </nav>
  );
}
export default NavBar;