

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);
root.render(
    <>
        <h1>This is working right !</h1>
        <Main/>
        <Header/>
        <Footer/>
        <Profilecard/>
    </>
);

function Main(){
    return(
        <div>
            <h1>Challenge 2 </h1>
            <h2>Name : <b>Gavathakatla Sujith Kumar </b></h2>
            <h2>College : ACEM madanapalle </h2>
            <h2>Branch : CSE</h2>
        </div>
    )
}

function Header(){
    return(
        <header>
            <h2>Welcome to the react session ! bro </h2>
        </header>
    )
}
function Footer(){
    return(
        <footer>
            <h2>Learning the react session 1 bro  </h2>
        </footer>
    )
}

function Profilecard(){
    return(
        <div >
            <center>
                <h2>Name : Sujith</h2>
                <h2>Tech Stack : Java Python Full Stack Web Developer </h2>
                <h2>raect,java,python,jdbc,marven,gradle,tailwindcss,css,js,fastapi,mysql,c,nodejs</h2>
            </center>
        </div>
    )
}
