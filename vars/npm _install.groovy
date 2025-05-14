stage('Install Dependencies') {
    steps {
        dir('backend') {
            sh 'npm install'
        }
    }
}
