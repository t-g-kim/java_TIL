package reactive;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class PubSub {
    public static void main(String[] args) {

        // Publisher <- Observable
        // Subscriber <- Observer

        Iterable<Integer> iter = Arrays.asList(1,2,3,4,5);

        Publisher p = new Publisher() {
            @Override
            public void subscribe(Subscriber subscriber) {

                Iterator<Integer> it = iter.iterator();

                // subscription이라는 object
                subscriber.onSubscribe(new Subscription() {
                    @Override
                    public void request(long n) {

                        while (n-- >0) {
                            if(it.hasNext()) {
                                subscriber.onNext(it.next());
                            } else {
                                subscriber.onComplete();
                                break;
                            }
                        }
                    }

                    @Override
                    public void cancel() {

                    }
                });
            }
        };
        Subscriber<Integer> s = new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("onSubscribe");
                subscription.request(1);
            }

            // 데이터를 하나씩 끌어온다.
            @Override
            public void onNext(Integer item) {
                System.out.println("onNext " + item);
            }

            // 어떤종류의 exception도 처리한다.
            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        p.subscribe(s);
    }
}
