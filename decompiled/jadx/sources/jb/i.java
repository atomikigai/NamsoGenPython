package jb;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import x9.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements ya.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5744a;

    public /* synthetic */ i(int i) {
        this.f5744a = i;
    }

    @Override // ya.b
    public final Object get() {
        switch (this.f5744a) {
            case 0:
                Random random = k.f5746j;
                return null;
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return null;
            case 3:
                return ExecutorsRegistrar.a();
            case 4:
                m mVar = ExecutorsRegistrar.f2719a;
                return new y9.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new y9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f2722d.get());
            case 5:
                m mVar2 = ExecutorsRegistrar.f2719a;
                return new y9.f(Executors.newCachedThreadPool(new y9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f2722d.get());
            default:
                m mVar3 = ExecutorsRegistrar.f2719a;
                return Executors.newSingleThreadScheduledExecutor(new y9.a("Firebase Scheduler", 0, null));
        }
    }
}
