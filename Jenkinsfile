node {
   stage 'git clone'
   git 'https://github.com/mizo432/studio.git'

   stage 'clean build'
   sh './gradlew --daemon clean build'

   stage 'jnlp-servlet;genkey,build'
   sh './gradlew :jnlp-servlet:genkey :jnlp-servlet:build'

   stage 'sales-management build'
   sh './gradlew :sales-management:build'

// JUnitテストレポートを保存
   stage 'copy test report'
   step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])

}