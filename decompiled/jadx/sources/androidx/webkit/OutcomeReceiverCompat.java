package androidx.webkit;

import java.lang.Throwable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface OutcomeReceiverCompat<T, E extends Throwable> {
    void onResult(T t10);

    default void onError(E e) {
    }
}
