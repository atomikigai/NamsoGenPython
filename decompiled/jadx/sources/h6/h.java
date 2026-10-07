package h6;

import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4998b;

    public /* synthetic */ h(Object obj, int i) {
        this.f4997a = i;
        this.f4998b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4997a) {
            case 0:
                ((AtomicInteger) this.f4998b).set(i);
                break;
            case 1:
                ((j) this.f4998b).b();
                break;
            default:
                r0 r0Var = d6.p.C.f2979c;
                r0.q(((l) this.f4998b).f5025a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }
}
