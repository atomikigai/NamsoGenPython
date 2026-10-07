package f5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import r4.i;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3597b;

    public /* synthetic */ a(d dVar, i iVar) {
        this.f3596a = dVar;
        this.f3597b = iVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d dVar = this.f3596a;
        dVar.getClass();
        if (!task.isSuccessful()) {
            dVar.f(s4.h.a(task.getException()));
        } else {
            dVar.h(this.f3597b, (a0) task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f3596a.h(this.f3597b, (a0) obj);
    }
}
