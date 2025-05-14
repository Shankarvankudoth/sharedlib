def call(String containerName, String imageName, String port = '3000:3000') {
    echo 'Stopping and removing old container if it exists...'
    sh """
        docker stop ${containerName} || true
        docker rm ${containerName} || true
        docker run -d --name ${containerName} -p ${port} ${imageName}
    """
}
