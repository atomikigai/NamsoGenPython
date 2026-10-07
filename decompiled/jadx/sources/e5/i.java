package e5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements OnSuccessListener, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f3287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v9.e f3288b;

    public /* synthetic */ i(k kVar, v9.e eVar) {
        this.f3287a = kVar;
        this.f3288b = eVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        k kVar = this.f3287a;
        kVar.getClass();
        if (task.isSuccessful()) {
            kVar.g(this.f3288b);
        } else {
            kVar.f(s4.h.a(task.getException()));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f3287a.g(this.f3288b);
    }
}
