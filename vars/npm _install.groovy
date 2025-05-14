sdef call() {
    echo 'Installing backend dependencies...'
    dir('backend') {
        // Check if package.json exists before running npm install
        if (fileExists('package.json')) {
            sh 'npm install'
        } else {
            error 'package.json not found in backend directory!'
        }
    }
}
