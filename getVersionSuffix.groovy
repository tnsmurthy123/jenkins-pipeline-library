def call(Map args) {
    node {
    if ( args.isReleaseCandidate) {
        return args.rcNumber
       
    }
    else {
         return args.rcNumber + "ci." + env.BUILD_NUMBER
    }
    }
    
} 