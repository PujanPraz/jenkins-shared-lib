def call(String projectName, String version){
   withCredentials([
                     usernamePassword(
                         credentialsId: "dockerHubCred",
                         usernameVariable: "USERNAME",
                         passwordVariable: "PASSWORD"
                    )]) {
                          sh '''
                            docker login -u "$USERNAME" -p "$PASSWORD"
                            docker push "$USERNAME/${projectName}:${version}"
                        '''
                 }
}
