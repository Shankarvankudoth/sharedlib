stage('Install Dependencies') {
    script {
        echo 'Installing backend dependencies...'
        sh 'npm install'
    }
}
