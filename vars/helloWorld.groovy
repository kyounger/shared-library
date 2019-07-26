def call(String data = 'world') {
    sh "echo Hello ${data} -- from v0.0.2!"
}
