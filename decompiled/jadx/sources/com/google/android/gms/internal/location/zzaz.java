package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import w7.c;
import w7.c0;
import w7.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, m mVar, n nVar, String str, i iVar) {
        super(context, looper, mVar, nVar, str, iVar);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() throws RemoteException {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, o oVar, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, oVar, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, o oVar, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, oVar, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(com.google.android.gms.common.api.internal.m mVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzh(mVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(com.google.android.gms.common.api.internal.m mVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzi(mVar, zzaiVar);
    }

    public final void zzI(boolean z4) throws RemoteException {
        this.zzf.zzk(z4);
    }

    public final void zzJ(Location location) throws RemoteException {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) throws RemoteException {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(w7.i iVar, e eVar, String str) throws RemoteException {
        checkConnected();
        i0.a("locationSettingsRequest can't be null nor empty.", iVar != null);
        i0.a("listener can't be null.", eVar != null);
        ((zzam) getService()).zzt(iVar, new zzay(eVar), null);
    }

    public final void zzq(long j4, PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        i0.i(pendingIntent);
        i0.a("detectionIntervalMillis must be >= 0", j4 >= 0);
        ((zzam) getService()).zzh(j4, true, pendingIntent);
    }

    public final void zzr(c cVar, PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        i0.j(cVar, "activityTransitionRequest must be specified.");
        i0.j(pendingIntent, "PendingIntent must be specified.");
        i0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(cVar, pendingIntent, new u(eVar));
    }

    public final void zzs(PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        i0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new u(eVar));
    }

    public final void zzt(PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        i0.i(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        i0.j(pendingIntent, "PendingIntent must be specified.");
        i0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new u(eVar));
    }

    public final void zzv(w7.e eVar, PendingIntent pendingIntent, e eVar2) throws RemoteException {
        checkConnected();
        i0.j(eVar, "geofencingRequest can't be null.");
        i0.j(pendingIntent, "PendingIntent must be specified.");
        i0.j(eVar2, "ResultHolder not provided.");
        ((zzam) getService()).zzd(eVar, pendingIntent, new zzaw(eVar2));
    }

    public final void zzw(z zVar, e eVar) throws RemoteException {
        checkConnected();
        i0.j(zVar, "removeGeofencingRequest can't be null.");
        i0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(zVar, new zzax(eVar));
    }

    public final void zzx(PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        i0.j(pendingIntent, "PendingIntent must be specified.");
        i0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(eVar), getContext().getPackageName());
    }

    public final void zzy(List<String> list, e eVar) throws RemoteException {
        checkConnected();
        i0.a("geofenceRequestIds can't be null nor empty.", list != null && list.size() > 0);
        i0.j(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(eVar), getContext().getPackageName());
    }

    public final Location zzz(String str) throws RemoteException {
        return n7.c.e(getAvailableFeatures(), c0.f9697a) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
