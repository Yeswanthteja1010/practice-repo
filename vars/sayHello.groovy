def call() {

stage('Checkout') {

//checkout scm
echo 'chrck'
}

stage('Unit Tests') {

echo 'Running unit tests...'

sh'./gradlew test'
}
}
