def call(String url, String branch){
  echo 'Cloning the backend repository...'
  git url: "${url}", branch: "${branch}"
}
