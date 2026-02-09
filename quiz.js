const topic = localStorage.getItem("topic");
let questionsData = [];

fetch("http://127.0.0.1:8000/quiz?topic=" + topic, { method: "POST" })
  .then(res => res.json())
  .then(data => {
    questionsData = data.questions;
    let html = "";
    data.questions.forEach((q, i) => {
      html += `<p>${i+1}. ${q.q}</p>`;
      q.options.forEach(opt => {
        html += `<input type="radio" name="q${i}" value="${opt}">${opt}<br>`;
      });
    });
    document.getElementById("quiz").innerHTML = html;
  });

function submitQuiz() {
  let answers = [];

  questionsData.forEach((q, i) => {
    const selected = document.querySelector(`input[name=q${i}]:checked`)?.value;
    answers.push({
      question: q.q,
      selected,
      correct: q.answer
    });
  });

  fetch("http://127.0.0.1:8000/evaluate", {
    method: "POST",
    headers: {"Content-Type": "application/json"},
    body: JSON.stringify({ topic, answers })
  })
  .then(res => res.json())
  .then(data => {
    document.getElementById("result").innerHTML =
      `<h3>Score: ${data.score}%</h3>
       <p>${data.recommendation}</p>`;
  });
}
