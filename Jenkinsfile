node {
   stage 'git clone'
   git 'https://github.com/mizo432/studio.git'

   stage 'clean'
   sh './gradlew --daemon clean'

   stage 'build :venus-util:build'
   sh './gradlew --daemon :venus-util:build'

   stage 'build :ddd:build'
   sh './gradlew --daemon :ddd:build'

   stage 'build :general:build'
   sh './gradlew --daemon :general:build'

   stage 'build :core:build'
   sh './gradlew --daemon :core:build'

   stage 'build :web:build'
   sh './gradlew --daemon :web:build'

   stage 'build build'
   sh './gradlew --daemon build'

// JUnitテストレポートを保存
   stage 'copy test report'
   step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])

}