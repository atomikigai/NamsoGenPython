package y4;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.w;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s4.h;
import v9.j0;
import v9.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class d extends d5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u f10567k;

    public d(Application application) {
        super(application);
    }

    public final void g(w wVar, String str, boolean z4) {
        f(h.b());
        FirebaseAuth firebaseAuth = this.i;
        i0.i(firebaseAuth);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long jConvert = timeUnit.convert(120L, timeUnit);
        Long lValueOf = Long.valueOf(jConvert);
        j0 j0Var = new j0(this, str);
        u uVar = z4 ? this.f10567k : null;
        if (new Intent("android.intent.action.VIEW", Uri.parse("http://")).resolveActivity(wVar.getPackageManager()) == null) {
            f(h.a(new ActivityNotFoundException("No browser was found in this device")));
            return;
        }
        Executor executor = firebaseAuth.f2718x;
        if (jConvert < 0 || jConvert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        i0.f(str, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
        FirebaseAuth.i(new v1.b(firebaseAuth, lValueOf, j0Var, executor, str, wVar, uVar));
    }
}
