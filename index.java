document.getElementById("contactForm").addEventListener("submit", function(e) {
  e.preventDefault();

  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const message = document.getElementById("message").value.trim();
  const formMessage = document.getElementById("formMessage");

  if (name && email && message) {
    formMessage.style.color = "purple";
    formMessage.textContent = "Thanks for your message!";
    this.reset();
  } else {
    formMessage.style.color = "blue";
    formMessage.textContent = "Please fill in all fields.";
  }
});
