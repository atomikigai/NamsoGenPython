package w9;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements OnFailureListener, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f9838c;

    public /* synthetic */ h(TaskCompletionSource taskCompletionSource, Context context, int i) {
        this.f9836a = i;
        this.f9837b = taskCompletionSource;
        this.f9838c = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f9836a) {
            case 0:
                this.f9837b.setException(exc);
                ea.e.f(this.f9838c);
                break;
            case 1:
            default:
                this.f9837b.setException(exc);
                ea.e.f(this.f9838c);
                break;
            case 2:
                this.f9837b.setException(exc);
                ea.e.f(this.f9838c);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.f9836a) {
            case 1:
                this.f9837b.setResult((a0) obj);
                ea.e.f(this.f9838c);
                break;
            case 2:
            default:
                this.f9837b.setResult((a0) obj);
                ea.e.f(this.f9838c);
                break;
            case 3:
                this.f9837b.setResult((a0) obj);
                ea.e.f(this.f9838c);
                break;
        }
    }
}
