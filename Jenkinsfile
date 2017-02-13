node {
   stage 'git clone'
   git 'https://github.com/mizo432/studio.git'

   stage 'clean build'
   sh './gradlew clean build'

// JUnitテストレポートを保存
   step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])

   stage 'sales-management build'
   sh './gradlew :sales-management:build'

   stage 'jnlp-servlet;genkey,build'
   sh './gradlew :jnlp-servlet:genkey :jnlp-servlet:build'

}