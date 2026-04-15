 document.getElementById("form").addEventListener("submit", function(event) {
        event.preventDefault();
        
        const user = document.getElementById("user").value;
        const email = document.getElementById("email").value;
        const info = {user: user, email: email}
        
        console.log(info);

        window.location.href = "conf.html";
    });