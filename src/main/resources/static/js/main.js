const loginBtn = document.querySelector(".login");
const searchBtn = document.querySelector(".search__icon");
const searchInput = document.querySelector(".search__book");

loginBtn.addEventListener("click", (e) => {
  alert("로그인");
});

searchBtn.addEventListener("click", (e) => {
  alert("검색");
});

searchInput.addEventListener("keydown", (e) => {
  if (e.keyCode === 13) {
    alert("검색");
  }
});
