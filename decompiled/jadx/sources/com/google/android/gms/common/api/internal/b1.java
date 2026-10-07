package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f2063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f2064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zau f2065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g7.e f2066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(l lVar) {
        super(lVar);
        g7.e eVar = g7.e.e;
        this.f2064b = new AtomicReference(null);
        this.f2065c = new zau(Looper.getMainLooper());
        this.f2066d = eVar;
    }

    public abstract void a(g7.b bVar, int i);

    public abstract void b();

    public final void c(g7.b bVar, int i) {
        z0 z0Var = new z0(bVar, i);
        while (true) {
            AtomicReference atomicReference = this.f2064b;
            if (atomicReference.compareAndSet(null, z0Var)) {
                this.f2065c.post(new a1(0, this, z0Var));
                return;
            } else if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i, int i10, Intent intent) {
        AtomicReference atomicReference = this.f2064b;
        z0 z0Var = (z0) atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int iD = this.f2066d.d(getActivity(), g7.f.f4240a);
                if (iD == 0) {
                    atomicReference.set(null);
                    b();
                    return;
                } else {
                    if (z0Var == null) {
                        return;
                    }
                    if (z0Var.f2166b.f4229b == 18 && iD == 18) {
                        return;
                    }
                }
            }
        } else if (i10 == -1) {
            atomicReference.set(null);
            b();
            return;
        } else if (i10 == 0) {
            if (z0Var != null) {
                g7.b bVar = new g7.b(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, z0Var.f2166b.toString());
                int i11 = z0Var.f2165a;
                atomicReference.set(null);
                a(bVar, i11);
                return;
            }
            return;
        }
        if (z0Var != null) {
            g7.b bVar2 = z0Var.f2166b;
            int i12 = z0Var.f2165a;
            atomicReference.set(null);
            a(bVar2, i12);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        g7.b bVar = new g7.b(13, null);
        AtomicReference atomicReference = this.f2064b;
        z0 z0Var = (z0) atomicReference.get();
        int i = z0Var == null ? -1 : z0Var.f2165a;
        atomicReference.set(null);
        a(bVar, i);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2064b.set(bundle.getBoolean("resolving_error", false) ? new z0(new g7.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        z0 z0Var = (z0) this.f2064b.get();
        if (z0Var == null) {
            return;
        }
        g7.b bVar = z0Var.f2166b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", z0Var.f2165a);
        bundle.putInt("failed_status", bVar.f4229b);
        bundle.putParcelable("failed_resolution", bVar.f4230c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f2063a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        this.f2063a = false;
    }
}
