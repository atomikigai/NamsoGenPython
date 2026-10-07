package f7;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f3635b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f3637d;
    public final /* synthetic */ int e;

    public i(int i, int i10, Bundle bundle, int i11) {
        this.e = i11;
        this.f3634a = i;
        this.f3636c = i10;
        this.f3637d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(j jVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(jVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb2.append("Failing ");
            sb2.append(strValueOf);
            sb2.append(" with ");
            sb2.append(strValueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f3635b.setException(jVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb2.append("Finishing ");
            sb2.append(strValueOf);
            sb2.append(" with ");
            sb2.append(strValueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f3635b.setResult(bundle);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(this.f3636c);
        sb2.append(" id=");
        sb2.append(this.f3634a);
        sb2.append(" oneWay=");
        sb2.append(a());
        sb2.append("}");
        return sb2.toString();
    }
}
