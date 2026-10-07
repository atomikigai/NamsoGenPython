package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private g7.b zzB;
    private boolean zzC;
    private volatile o0 zzD;
    u0 zza;
    final Handler zzb;
    protected d zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final m zzn;
    private final g7.f zzo;
    private final Object zzp;
    private final Object zzq;
    private p zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private l0 zzu;
    private int zzv;
    private final b zzw;
    private final c zzx;
    private final int zzy;
    private final String zzz;
    private static final g7.d[] zze = new g7.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, Looper looper, b bVar, c cVar, int i) {
        s0 s0VarA = m.a(context);
        g7.f fVar = g7.f.f4241b;
        i0.i(bVar);
        i0.i(cVar);
        this(context, looper, s0VarA, fVar, i, bVar, cVar, null);
    }

    public static void zzj(f fVar, o0 o0Var) {
        fVar.zzD = o0Var;
        if (fVar.usesClientTelemetry()) {
            j jVar = o0Var.f2235d;
            t tVarC = t.c();
            u uVar = jVar == null ? null : jVar.f2203a;
            synchronized (tVarC) {
                try {
                    if (uVar == null) {
                        tVarC.f2263a = t.f2262c;
                        return;
                    }
                    u uVar2 = (u) tVarC.f2263a;
                    if (uVar2 == null || uVar2.f2264a < uVar.f2264a) {
                        tVarC.f2263a = uVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(f fVar, int i) {
        int i10;
        int i11;
        synchronized (fVar.zzp) {
            i10 = fVar.zzv;
        }
        if (i10 == 3) {
            fVar.zzC = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(i11, fVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(f fVar, int i, int i10, IInterface iInterface) {
        synchronized (fVar.zzp) {
            try {
                if (fVar.zzv != i) {
                    return false;
                }
                fVar.a(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(f fVar) {
        if (fVar.zzC || TextUtils.isEmpty(fVar.getServiceDescriptor()) || TextUtils.isEmpty(fVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(fVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a(int i, IInterface iInterface) {
        u0 u0Var;
        i0.b((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                if (i == 1) {
                    l0 l0Var = this.zzu;
                    if (l0Var != null) {
                        m mVar = this.zzn;
                        String str = this.zza.f2268a;
                        i0.i(str);
                        String str2 = this.zza.f2269b;
                        zze();
                        mVar.b(str, str2, l0Var, this.zza.f2270c);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    l0 l0Var2 = this.zzu;
                    if (l0Var2 != null && (u0Var = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + u0Var.f2268a + " on " + u0Var.f2269b);
                        m mVar2 = this.zzn;
                        String str3 = this.zza.f2268a;
                        i0.i(str3);
                        String str4 = this.zza.f2269b;
                        zze();
                        mVar2.b(str3, str4, l0Var2, this.zza.f2270c);
                        this.zzd.incrementAndGet();
                    }
                    l0 l0Var3 = new l0(this, this.zzd.get());
                    this.zzu = l0Var3;
                    u0 u0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new u0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new u0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = u0Var2;
                    if (u0Var2.f2270c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f2268a)));
                    }
                    m mVar3 = this.zzn;
                    String str5 = this.zza.f2268a;
                    i0.i(str5);
                    if (!mVar3.c(new p0(str5, this.zza.f2269b, this.zza.f2270c), l0Var3, zze(), getBindServiceExecutor())) {
                        u0 u0Var3 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + u0Var3.f2268a + " on " + u0Var3.f2269b);
                        zzl(16, null, this.zzd.get());
                    }
                } else if (i == 4) {
                    i0.i(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iD = this.zzo.d(this.zzl, getMinApkVersion());
        if (iD == 0) {
            connect(new t(this));
        } else {
            a(1, null);
            triggerNotAvailable(new t(this), iD, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(d dVar) {
        i0.j(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i = 0; i < size; i++) {
                    c0 c0Var = (c0) this.zzt.get(i);
                    synchronized (c0Var) {
                        c0Var.f2182a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        p pVar;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            pVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((e0) pVar).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j4 = this.zzh;
            printWriterAppend.println(j4 + " " + simpleDateFormat.format(new Date(j4)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.zzf;
            if (i10 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i10 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i10 != 3) {
                printWriter.append((CharSequence) String.valueOf(i10));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.zzg;
            printWriterAppend2.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) qd.b.p(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j11 = this.zzj;
            printWriterAppend3.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public g7.d[] getApiFeatures() {
        return zze;
    }

    public final g7.d[] getAvailableFeatures() {
        o0 o0Var = this.zzD;
        if (o0Var == null) {
            return null;
        }
        return o0Var.f2233b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        u0 u0Var;
        if (!isConnected() || (u0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return u0Var.f2269b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return g7.f.f4240a;
    }

    public void getRemoteService(n nVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i = g7.f.f4240a;
        Scope[] scopeArr = k.f2209z;
        Bundle bundle = new Bundle();
        int i10 = this.zzy;
        g7.d[] dVarArr = k.A;
        k kVar = new k(6, i10, i, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        kVar.f2213d = this.zzl.getPackageName();
        kVar.f2215r = getServiceRequestExtraArgs;
        if (set != null) {
            kVar.f2214f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            kVar.f2216s = account;
            if (nVar != null) {
                kVar.e = nVar.asBinder();
            }
        } else if (requiresAccount()) {
            kVar.f2216s = getAccount();
        }
        kVar.f2217t = zze;
        kVar.f2218u = getApiFeatures();
        if (usesClientTelemetry()) {
            kVar.f2221x = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    p pVar = this.zzr;
                    if (pVar != null) {
                        ((e0) pVar).y(new k0(this, this.zzd.get()), kVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                i0.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                p pVar = this.zzr;
                if (pVar == null) {
                    return null;
                }
                return ((e0) pVar).asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public j getTelemetryConfiguration() {
        o0 o0Var = this.zzD;
        if (o0Var == null) {
            return null;
        }
        return o0Var.f2235d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z4;
        synchronized (this.zzp) {
            z4 = this.zzv == 4;
        }
        return z4;
    }

    public boolean isConnecting() {
        boolean z4;
        synchronized (this.zzp) {
            int i = this.zzv;
            z4 = true;
            if (i != 2 && i != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(g7.b bVar) {
        this.zzi = bVar.f4229b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i10, -1, new m0(this, i, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        e7.i iVar = (e7.i) eVar;
        ((com.google.android.gms.common.api.internal.f0) iVar.f3489b).f2093x.f2112y.post(new androidx.activity.i(iVar, 9));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i));
    }

    public void triggerNotAvailable(d dVar, int i, PendingIntent pendingIntent) {
        i0.j(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i, Bundle bundle, int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i10, -1, new n0(this, i)));
    }

    public f(Context context, Looper looper, s0 s0Var, g7.f fVar, int i, b bVar, c cVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        i0.j(context, "Context must not be null");
        this.zzl = context;
        i0.j(looper, "Looper must not be null");
        this.zzm = looper;
        i0.j(s0Var, "Supervisor must not be null");
        this.zzn = s0Var;
        i0.j(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new j0(this, looper);
        this.zzy = i;
        this.zzw = bVar;
        this.zzx = cVar;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
