package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.s> extends com.google.android.gms.common.api.q {
    static final ThreadLocal zaa = new c1(0);
    public static final /* synthetic */ int zad = 0;
    private d1 resultGuardian;
    protected final f zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.t zah;
    private com.google.android.gms.common.api.s zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.o zao;
    private volatile t0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.o oVar) {
        this.zab = new f(oVar != null ? ((i0) oVar).f2119b.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zal(com.google.android.gms.common.api.s sVar) {
        if (sVar instanceof zzcdr) {
            try {
                ((zzcdr) sVar).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(sVar)), e);
            }
        }
    }

    public final com.google.android.gms.common.api.s a() {
        com.google.android.gms.common.api.s sVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.i0.k("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.i0.k("Result is not ready.", isReady());
            sVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.common.internal.i0.i(sVar);
        return sVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final void addStatusListener(com.google.android.gms.common.api.p pVar) {
        com.google.android.gms.common.internal.i0.a("Callback cannot be null.", pVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    pVar.a(this.zak);
                } else {
                    this.zag.add(pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        com.google.android.gms.common.internal.i0.h("await must not be called on the UI thread");
        com.google.android.gms.common.internal.i0.k("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.i0.k("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f2041f);
        }
        com.google.android.gms.common.internal.i0.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.s sVar) {
        this.zaj = sVar;
        this.zak = sVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.t tVar = this.zah;
            if (tVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(tVar, a());
            } else if (this.zaj instanceof zzcdr) {
                this.resultGuardian = new d1(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.common.api.p) arrayList.get(i)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f2044t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z4;
        synchronized (this.zae) {
            z4 = this.zam;
        }
        return z4;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(com.google.android.gms.common.internal.o oVar) {
        synchronized (this.zae) {
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar) {
        synchronized (this.zae) {
            try {
                if (tVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.i0.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.i0.k("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tVar, a());
                } else {
                    this.zah = tVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.s> com.google.android.gms.common.api.v then(com.google.android.gms.common.api.u uVar) {
        t0 t0Var;
        com.google.android.gms.common.internal.i0.k("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.i0.k("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.i0.k("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.i0.k("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new t0(this.zac);
                t0 t0Var2 = this.zap;
                synchronized (t0Var2.f2150b) {
                    t0Var = new t0(t0Var2.f2151c);
                    t0Var2.f2149a = t0Var;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t0Var;
    }

    public final void zak() {
        boolean z4 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z4 = false;
        }
        this.zaq = z4;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.o) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zan(u0 u0Var) {
        this.zai.set(u0Var);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void setResult(R r10) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r10);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.i0.k("Results have already been set", !isReady());
                com.google.android.gms.common.internal.i0.k("Result has already been consumed", !this.zal);
                b(r10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.q
    @ResultIgnorabilityUnspecified
    public final R await(long j4, TimeUnit timeUnit) {
        if (j4 > 0) {
            com.google.android.gms.common.internal.i0.h("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.i0.k("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.i0.k("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j4, timeUnit)) {
                forceFailureUnlessReady(Status.f2043s);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f2041f);
        }
        com.google.android.gms.common.internal.i0.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar, long j4, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (tVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.i0.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.i0.k("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tVar, a());
                } else {
                    this.zah = tVar;
                    f fVar = this.zab;
                    fVar.sendMessageDelayed(fVar.obtainMessage(2, this), timeUnit.toMillis(j4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
