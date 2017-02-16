node {
   stage 'git clone'
   git 'https://github.com/mizo432/studio.git'

   stage 'clean'
   sh './gradlew --daemon clean'

   stage 'venus-util :build'
   sh './gradlew --daemon :venus-util:build'

   stage 'ddd :build'
   sh './gradlew --daemon :ddd:build'

   stage 'general :build'
   sh './gradlew --daemon :general:build'

   stage 'core :build'
   sh './gradlew --daemon :core:build'

   stage 'web :build'
   sh './gradlew --daemon :web:build'

   stage 'build'
   sh './gradlew --daemon build'

// JUnitテストレポートを保存
   stage 'copy test report'
   step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])

}