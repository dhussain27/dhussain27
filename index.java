// Example password (in a real application, store it securely):
const correctPassword = "secure123";

// Function to validate the entered password
function validatePassword() {
    const enteredPassword = prompt("Enter the admin password:");
    if (enteredPassword === correctPassword) {
        alert("Access granted! You are now in the admin panel.");
        // Redirect to the admin page or perform admin tasks here
    } else {
        alert("Access denied! Incorrect password.");
    }
}

// Call the function when needed, e.g., from a button click
// document.getElementById("adminButton").addEventListener("click", validatePassword);
