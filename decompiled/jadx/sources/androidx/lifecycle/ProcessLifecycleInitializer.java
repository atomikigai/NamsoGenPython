package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements k2.b {
    @Override // k2.b
    public final List a() {
        return vb.q.f9297a;
    }

    @Override // k2.b
    public final Object b(Context context) {
        jc.i.e(context, "context");
        k2.a aVarC = k2.a.c(context);
        jc.i.d(aVarC, "getInstance(context)");
        if (!aVarC.f5915b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!o.f1076a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            jc.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        d0 d0Var = d0.f1038t;
        d0Var.getClass();
        d0Var.e = new Handler();
        d0Var.f1043f.d(l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        jc.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new c0(d0Var));
        return d0Var;
    }
}
