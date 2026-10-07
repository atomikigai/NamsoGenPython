package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements k2.b {
    @Override // k2.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // k2.b
    public final Object b(Context context) {
        Object objB;
        s sVar = new s(new a4.i(context, 2));
        sVar.f765a = 1;
        if (l.f771j == null) {
            synchronized (l.i) {
                try {
                    if (l.f771j == null) {
                        l.f771j = new l(sVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        k2.a aVarC = k2.a.c(context);
        aVarC.getClass();
        synchronized (k2.a.e) {
            try {
                objB = aVarC.f5914a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.t tVarL = ((androidx.lifecycle.r) objB).l();
        tVarL.a(new androidx.lifecycle.d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void onResume() {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
                tVarL.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
