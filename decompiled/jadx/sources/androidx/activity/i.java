package androidx.activity;

import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.i0;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.ads.zzazl;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e6.b3;
import e6.c3;
import e6.z2;
import h6.n0;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.r1;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f358b;

    public /* synthetic */ i(Object obj, int i) {
        this.f357a = i;
        this.f358b = obj;
    }

    private final void a() {
        n0 n0Var = (n0) this.f358b;
        if (n0Var.f5037b) {
            if (!(n0Var.i() && n0Var.j()) && ((Boolean) zzbee.zzb.zze()).booleanValue()) {
                synchronized (n0Var.f5036a) {
                    try {
                        if (Looper.getMainLooper() == null) {
                            return;
                        }
                        if (n0Var.e == null) {
                            n0Var.e = new zzazl();
                        }
                        n0Var.e.zzd();
                        i6.h.f("start fetching content...");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ed.a aVarC;
        long jNanoTime;
        l.j jVar;
        switch (this.f357a) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!TextUtils.equals(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
            case 1:
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) this.f358b;
                dVar.f857a.endViewTransition(dVar.f858b);
                dVar.f859c.d();
                return;
            case 2:
                androidx.fragment.app.l lVar = (androidx.fragment.app.l) this.f358b;
                lVar.f916i0.onDismiss(lVar.f923q0);
                return;
            case 3:
                ((i0) this.f358b).u(true);
                return;
            case 4:
                synchronized (((androidx.lifecycle.y) this.f358b).f1105a) {
                    obj = ((androidx.lifecycle.y) this.f358b).f1109f;
                    ((androidx.lifecycle.y) this.f358b).f1109f = androidx.lifecycle.y.f1104k;
                    break;
                }
                ((androidx.lifecycle.y) this.f358b).j(obj);
                return;
            case 5:
                androidx.viewpager2.adapter.d dVar2 = (androidx.viewpager2.adapter.d) this.f358b;
                dVar2.f1205k = false;
                dVar2.m();
                return;
            case 6:
                c8.a aVar = (c8.a) this.f358b;
                synchronized (aVar.f1795a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f1801j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f1797c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 7:
                com.bumptech.glide.l lVar2 = (com.bumptech.glide.l) this.f358b;
                lVar2.f1880c.i(lVar2);
                return;
            case 8:
                ((f0) this.f358b).e();
                return;
            case 9:
                com.google.android.gms.common.api.g gVar = ((f0) ((e7.i) this.f358b).f3489b).f2083b;
                gVar.disconnect(gVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 10:
                ((q0) this.f358b).f2146r.d(new g7.b(4));
                return;
            case 11:
                ((ThreadLocal) ((a3.j) this.f358b).f110d).set(Boolean.TRUE);
                return;
            case 12:
                e6.z zVar = ((z2) this.f358b).f3464a.f3292a;
                if (zVar != null) {
                    try {
                        zVar.zze(1);
                        return;
                    } catch (RemoteException e10) {
                        i6.h.h("Could not notify onAdFailedToLoad event.", e10);
                        return;
                    }
                }
                return;
            case 13:
                e6.z zVar2 = ((b3) this.f358b).f3296a;
                if (zVar2 != null) {
                    try {
                        zVar2.zze(1);
                        return;
                    } catch (RemoteException e11) {
                        i6.h.h("Could not notify onAdFailedToLoad event.", e11);
                        return;
                    }
                }
                return;
            case 14:
                zzblw zzblwVar = ((c3) this.f358b).f3299a;
                if (zzblwVar != null) {
                    try {
                        zzblwVar.zzb(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e12) {
                        i6.h.h("Could not notify onComplete event.", e12);
                        return;
                    }
                }
                return;
            case 15:
                zzbxj zzbxjVar = (zzbxj) this.f358b;
                if (zzbxjVar != null) {
                    try {
                        zzbxjVar.zze(1);
                        return;
                    } catch (RemoteException e13) {
                        i6.h.i("#007 Could not call remote method.", e13);
                        return;
                    }
                }
                return;
            case 16:
                break;
            case 17:
                if (((TaskCompletionSource) this.f358b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 18:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f358b;
                String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (TextUtils.isEmpty(strB)) {
                    t2.m.d().b(ConstraintTrackingWorker.f1275v, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f1279t.h(new t2.i());
                    return;
                }
                ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f1276f);
                constraintTrackingWorker.f1280u = listenableWorkerA;
                if (listenableWorkerA == null) {
                    t2.m.d().a(ConstraintTrackingWorker.f1275v, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f1279t.h(new t2.i());
                    return;
                }
                c3.i iVarL = u2.j.S(constraintTrackingWorker.getApplicationContext()).f8821o.x().l(constraintTrackingWorker.getId().toString());
                if (iVarL == null) {
                    constraintTrackingWorker.f1279t.h(new t2.i());
                    return;
                }
                y2.c cVar = new y2.c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                cVar.b(Collections.singletonList(iVarL));
                if (!cVar.a(constraintTrackingWorker.getId().toString())) {
                    t2.m.d().a(ConstraintTrackingWorker.f1275v, da.v.i("Constraints not met for delegate ", strB, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.f1279t.h(new t2.j());
                    return;
                }
                t2.m.d().a(ConstraintTrackingWorker.f1275v, u3.b.b("Constraints met for delegate ", strB), new Throwable[0]);
                try {
                    m9.a aVarStartWork = constraintTrackingWorker.f1280u.startWork();
                    aVarStartWork.addListener(new a3.e(11, constraintTrackingWorker, aVarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    t2.m mVarD = t2.m.d();
                    String str = ConstraintTrackingWorker.f1275v;
                    mVarD.a(str, da.v.i("Delegated worker ", strB, " threw exception in startWork."), th2);
                    synchronized (constraintTrackingWorker.f1277r) {
                        try {
                            if (constraintTrackingWorker.f1278s) {
                                t2.m.d().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.f1279t.h(new t2.j());
                            } else {
                                constraintTrackingWorker.f1279t.h(new t2.i());
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 19:
                ((g6.i) this.f358b).zzc();
                return;
            case 20:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f358b).f2542c.f4360r;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case zzbbs.zzt.zzm /* 21 */:
                h6.p pVar = (h6.p) this.f358b;
                pVar.zzb = Thread.currentThread();
                pVar.zza();
                return;
            case 22:
                a();
                return;
            case 23:
                c9.f fVar = (c9.f) this.f358b;
                fVar.f1816b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar.e;
                y0.d dVar3 = bottomSheetBehavior.M;
                if (dVar3 != null && dVar3.f()) {
                    fVar.b(fVar.f1817c);
                    return;
                } else {
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.C(fVar.f1817c);
                        return;
                    }
                    return;
                }
            case 24:
                kb.m mVar = (kb.m) this.f358b;
                ScheduledExecutorService scheduledExecutorService = mVar.f6194f;
                if (mVar.a()) {
                    kb.j jVarB = mVar.f6201o.b();
                    mVar.f6200n.getClass();
                    if (new Date(System.currentTimeMillis()).before(jVarB.f6181b)) {
                        mVar.h();
                        return;
                    }
                    za.c cVar2 = (za.c) mVar.i;
                    Task taskD = cVar2.d();
                    Task taskC = cVar2.c();
                    Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskC}).continueWithTask(scheduledExecutorService, new e5.d(mVar, taskD, taskC, 7));
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(scheduledExecutorService, new e5.c(17, mVar, taskContinueWithTask));
                    return;
                }
                return;
            case 25:
                r1 r1Var = (r1) this.f358b;
                r1Var.f6418w = null;
                r1Var.drawableStateChanged();
                return;
            case 26:
                ActionMenuView actionMenuView = ((Toolbar) this.f358b).f513a;
                if (actionMenuView == null || (jVar = actionMenuView.E) == null) {
                    return;
                }
                jVar.l();
                return;
            case 27:
                o3.r rVar = (o3.r) this.f358b;
                o3.b bVar = rVar.e;
                bVar.H(0);
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                o3.e eVar = o3.x.f7538k;
                bVar.G(rVar.f7525d, zzieVar, eVar);
                rVar.c(eVar);
                return;
            case 28:
                Worker worker = (Worker) this.f358b;
                try {
                    worker.f1243f.h(worker.doWork());
                    return;
                } catch (Throwable th4) {
                    worker.f1243f.i(th4);
                    return;
                }
            default:
                u0.g gVar2 = (u0.g) this.f358b;
                r1 r1Var2 = gVar2.f8760c;
                u0.a aVar2 = gVar2.f8758a;
                if (gVar2.f8771z) {
                    if (gVar2.f8769x) {
                        gVar2.f8769x = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = jCurrentAnimationTimeMillis;
                        aVar2.f8757g = -1L;
                        aVar2.f8756f = jCurrentAnimationTimeMillis;
                        aVar2.h = 0.5f;
                    }
                    if ((aVar2.f8757g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f8757g + ((long) aVar2.i)) || !gVar2.e()) {
                        gVar2.f8771z = false;
                        return;
                    }
                    if (gVar2.f8770y) {
                        gVar2.f8770y = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f8756f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j4 = jCurrentAnimationTimeMillis2 - aVar2.f8756f;
                    aVar2.f8756f = jCurrentAnimationTimeMillis2;
                    u0.h.b(gVar2.B, (int) (j4 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f8755d));
                    WeakHashMap weakHashMap = v0.f7946a;
                    q0.d0.m(r1Var2, this);
                    return;
                }
                return;
        }
        while (true) {
            ed.d dVar4 = (ed.d) this.f358b;
            synchronized (dVar4) {
                aVarC = dVar4.c();
            }
            if (aVarC == null) {
                return;
            }
            ed.c cVar3 = aVarC.f3537c;
            jc.i.b(cVar3);
            ed.d dVar5 = (ed.d) this.f358b;
            boolean zIsLoggable = ed.d.f3545j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                n9.b.a(aVarC, cVar3, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                ed.d.a(dVar5, aVarC);
                if (zIsLoggable) {
                    n9.b.a(aVarC, cVar3, "finished run in ".concat(n9.b.l(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th5) {
                try {
                    ((ThreadPoolExecutor) dVar5.f3546a.f3489b).execute(this);
                    throw th5;
                } catch (Throwable th6) {
                    if (zIsLoggable) {
                        n9.b.a(aVarC, cVar3, "failed a run in ".concat(n9.b.l(System.nanoTime() - jNanoTime)));
                    }
                    throw th6;
                }
            }
        }
    }
}
