// app.js
new Vue({
    el: '#app',
    data: {
        textInput: '',
        response: ''
    },
    methods: {
        sendMessage() {
            fetch('/chat/' + this.textInput)
                .then(response.json())
                .then(data => {
                    this.response = "답변: " + data["response"];
                })
                .catch(error => console.error('Error:', error));
        }
    }
});
