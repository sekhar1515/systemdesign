package com.patterns.singleTon;

public class SingleTonMainClass {
    public static void mainMethod(){
        //Lazy loading SingleTon here it is not thread safe and multiple threads access this will cause difficulty
        LazyLoadingSingleTon lazyLoadingSingleTon = LazyLoadingSingleTon.getInstance();
        lazyLoadingSingleTon.print();
        // Eager SingleTon will load the instance instantly without the issue
        EagerLoadingSingleTon eagerLoadingSingleTon = EagerLoadingSingleTon.getInstance();
        eagerLoadingSingleTon.print();
        //Synchroized at method level to prevent the access for multiple threads
        SynchronizedMethodLevelLazyLoading synchronizedMethodLevelLazyLoading = SynchronizedMethodLevelLazyLoading.getInstance();
        synchronizedMethodLevelLazyLoading.print();
        //Synchronized at class level where this is more efficient and reduce overhead
        SynchronizedSingleTonClassLevel synchronizedSingleTonClassLevel = SynchronizedSingleTonClassLevel.getInstance();
        synchronizedSingleTonClassLevel.print();
        // The beast approach and also one of the lazy loading approach
        // In this approach this is thread safe as well
        BillPughSolution billPughSolution = BillPughSolution.getInstance();
        billPughSolution.printBillPughInstnace();

        /*
        THe major use cases of single ton will be at
        1. User session
        2. Database connection
        3. Logger Classes
        4. Cache objects
        5. Thread pools
        6. Print queues.
         */
    }
}
