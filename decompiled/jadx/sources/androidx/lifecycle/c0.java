package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends f {
    final /* synthetic */ d0 this$0;

    /* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
    public static final class a extends f {
        final /* synthetic */ d0 this$0;

        public a(d0 d0Var) {
            this.this$0 = d0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            jc.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            jc.i.e(activity, "activity");
            d0 d0Var = this.this$0;
            int i = d0Var.f1039a + 1;
            d0Var.f1039a = i;
            if (i == 1 && d0Var.f1042d) {
                d0Var.f1043f.d(l.ON_START);
                d0Var.f1042d = false;
            }
        }
    }

    public c0(d0 d0Var) {
        this.this$0 = d0Var;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        jc.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = g0.f1047b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            jc.i.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((g0) fragmentFindFragmentByTag).f1048a = this.this$0.f1045s;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        jc.i.e(activity, "activity");
        d0 d0Var = this.this$0;
        int i = d0Var.f1040b - 1;
        d0Var.f1040b = i;
        if (i == 0) {
            Handler handler = d0Var.e;
            jc.i.b(handler);
            handler.postDelayed(d0Var.f1044r, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        jc.i.e(activity, "activity");
        b0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        jc.i.e(activity, "activity");
        d0 d0Var = this.this$0;
        int i = d0Var.f1039a - 1;
        d0Var.f1039a = i;
        if (i == 0 && d0Var.f1041c) {
            d0Var.f1043f.d(l.ON_STOP);
            d0Var.f1042d = true;
        }
    }
}
