package ea;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.w;
import androidx.lifecycle.z;
import bd.u;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fa.c1;
import java.util.ArrayList;
import v9.h0;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements h, z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f3513d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3516c;

    public /* synthetic */ e(int i) {
        this.f3514a = i;
    }

    public static void f(Context context) {
        e eVar = f3513d;
        eVar.f3515b = false;
        if (((BroadcastReceiver) eVar.f3516c) != null) {
            o1.b bVarA = o1.b.a(context);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) f3513d.f3516c;
            synchronized (bVarA.f7459b) {
                try {
                    ArrayList arrayList = (ArrayList) bVarA.f7459b.remove(broadcastReceiver);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            o1.a aVar = (o1.a) arrayList.get(size);
                            aVar.f7455d = true;
                            for (int i = 0; i < aVar.f7452a.countActions(); i++) {
                                String action = aVar.f7452a.getAction(i);
                                ArrayList arrayList2 = (ArrayList) bVarA.f7460c.get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        o1.a aVar2 = (o1.a) arrayList2.get(size2);
                                        if (aVar2.f7453b == broadcastReceiver) {
                                            aVar2.f7455d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        bVarA.f7460c.remove(action);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f3513d.f3516c = null;
    }

    public static final h0 h(Intent intent) {
        Parcelable.Creator<zzaic> creator = zzaic.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        zzaic zzaicVar = (zzaic) (byteArrayExtra == null ? null : c1.q(byteArrayExtra, creator));
        zzaicVar.zze(true);
        return h0.i(zzaicVar);
    }

    @Override // ea.h
    public void a(g gVar, int i) {
        StringBuilder sb2 = (StringBuilder) this.f3516c;
        if (this.f3515b) {
            this.f3515b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i);
    }

    public boolean b() {
        return this.f3515b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        o0.f fVar = (o0.f) this.f3516c;
        if (fVar == null) {
            return b();
        }
        fVar.getClass();
        char c10 = 0;
        c10 = 2;
        for (int i10 = 0; i10 < i && c10 == 2; i10++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i10));
            e eVar = o0.g.f7447a;
            if (directionality == 0) {
                c10 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c10 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c10 = 2;
                        continue;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return b();
        }
        return false;
    }

    public synchronized void d(x xVar, boolean z4) {
        try {
            if (this.f3515b || z4) {
                ((Handler) this.f3516c).obtainMessage(1, xVar).sendToTarget();
            } else {
                this.f3515b = true;
                xVar.b();
                this.f3515b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void e(zzji zzjiVar) {
        if (this.f3515b) {
            zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((u) this.f3516c).i(new i5.a(zzjiVar, i5.c.f5209a), new ga.a(28));
        } catch (Throwable unused) {
            zzc.zzn("BillingLogger", "logging failed.");
        }
    }

    public void g(w wVar, BroadcastReceiver broadcastReceiver) {
        this.f3516c = broadcastReceiver;
        o1.b bVarA = o1.b.a(wVar);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (bVarA.f7459b) {
            try {
                o1.a aVar = new o1.a(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) bVarA.f7459b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    bVarA.f7459b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(aVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) bVarA.f7460c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        bVarA.f7460c.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.z
    public void m(Object obj) {
        a4.b bVar = (a4.b) this.f3516c;
        bVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) bVar.f113b;
        signInHubActivity.setResult(signInHubActivity.M, signInHubActivity.N);
        signInHubActivity.finish();
        this.f3515b = true;
    }

    public String toString() {
        switch (this.f3514a) {
            case 2:
                return ((a4.b) this.f3516c).toString();
            default:
                return super.toString();
        }
    }

    public e() {
        this.f3514a = 5;
        this.f3516c = new Handler(Looper.getMainLooper(), new d9.c(1));
    }

    public e(o0.f fVar, boolean z4) {
        this.f3514a = 3;
        this.f3514a = 3;
        this.f3516c = fVar;
        this.f3515b = z4;
    }

    public e(e7.d dVar, a4.b bVar) {
        this.f3514a = 2;
        this.f3515b = false;
        this.f3516c = bVar;
    }

    public e(StringBuilder sb2) {
        this.f3514a = 0;
        this.f3516c = sb2;
        this.f3515b = true;
    }

    public e(BottomSheetBehavior bottomSheetBehavior, boolean z4) {
        this.f3514a = 1;
        this.f3516c = bottomSheetBehavior;
        this.f3515b = z4;
    }
}
