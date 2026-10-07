package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.webkit.TracingConfig;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.HashMap;
import q7.a;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcb extends zzbn implements zzcc {
    public zzcb() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface : new zzca(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzcf zzcdVar = null;
        zzcf zzcdVar2 = null;
        zzcf zzcdVar3 = null;
        zzcf zzcdVar4 = null;
        zzci zzcgVar = null;
        zzci zzcgVar2 = null;
        zzci zzcgVar3 = null;
        zzcf zzcdVar5 = null;
        zzcf zzcdVar6 = null;
        zzcf zzcdVar7 = null;
        zzcf zzcdVar8 = null;
        zzcf zzcdVar9 = null;
        zzcf zzcdVar10 = null;
        zzck zzcjVar = null;
        zzcf zzcdVar11 = null;
        zzcf zzcdVar12 = null;
        zzcf zzcdVar13 = null;
        zzcf zzcdVar14 = null;
        zzcf zzcdVar15 = null;
        switch (i) {
            case 1:
                a aVarY = b.y(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) zzbo.zza(parcel, zzcl.CREATOR);
                long j4 = parcel.readLong();
                zzbo.zzc(parcel);
                initialize(aVarY, zzclVar, j4);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                boolean zZzf = zzbo.zzf(parcel);
                boolean zZzf2 = zzbo.zzf(parcel);
                long j10 = parcel.readLong();
                zzbo.zzc(parcel);
                logEvent(string, string2, bundle, zZzf, zZzf2, j10);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar = iInterfaceQueryLocalInterface instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface : new zzcd(strongBinder);
                }
                long j11 = parcel.readLong();
                zzbo.zzc(parcel);
                logEventAndBundle(string3, string4, bundle2, zzcdVar, j11);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                a aVarY2 = b.y(parcel.readStrongBinder());
                boolean zZzf3 = zzbo.zzf(parcel);
                long j12 = parcel.readLong();
                zzbo.zzc(parcel);
                setUserProperty(string5, string6, aVarY2, zZzf3, j12);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zZzf4 = zzbo.zzf(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar15 = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcd(strongBinder2);
                }
                zzbo.zzc(parcel);
                getUserProperties(string7, string8, zZzf4, zzcdVar15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar14 = iInterfaceQueryLocalInterface3 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface3 : new zzcd(strongBinder3);
                }
                zzbo.zzc(parcel);
                getMaxUserProperties(string9, zzcdVar14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j13 = parcel.readLong();
                zzbo.zzc(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j14 = parcel.readLong();
                zzbo.zzc(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                zzbo.zzc(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar13 = iInterfaceQueryLocalInterface4 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface4 : new zzcd(strongBinder4);
                }
                zzbo.zzc(parcel);
                getConditionalUserProperties(string13, string14, zzcdVar13);
                break;
            case 11:
                boolean zZzf5 = zzbo.zzf(parcel);
                long j15 = parcel.readLong();
                zzbo.zzc(parcel);
                setMeasurementEnabled(zZzf5, j15);
                break;
            case 12:
                long j16 = parcel.readLong();
                zzbo.zzc(parcel);
                resetAnalyticsData(j16);
                break;
            case 13:
                long j17 = parcel.readLong();
                zzbo.zzc(parcel);
                setMinimumSessionDuration(j17);
                break;
            case 14:
                long j18 = parcel.readLong();
                zzbo.zzc(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case 15:
                a aVarY3 = b.y(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j19 = parcel.readLong();
                zzbo.zzc(parcel);
                setCurrentScreen(aVarY3, string15, string16, j19);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar12 = iInterfaceQueryLocalInterface5 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface5 : new zzcd(strongBinder5);
                }
                zzbo.zzc(parcel);
                getCurrentScreenName(zzcdVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar11 = iInterfaceQueryLocalInterface6 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface6 : new zzcd(strongBinder6);
                }
                zzbo.zzc(parcel);
                getCurrentScreenClass(zzcdVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzcjVar = iInterfaceQueryLocalInterface7 instanceof zzck ? (zzck) iInterfaceQueryLocalInterface7 : new zzcj(strongBinder7);
                }
                zzbo.zzc(parcel);
                setInstanceIdProvider(zzcjVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar10 = iInterfaceQueryLocalInterface8 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface8 : new zzcd(strongBinder8);
                }
                zzbo.zzc(parcel);
                getCachedAppInstanceId(zzcdVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar9 = iInterfaceQueryLocalInterface9 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface9 : new zzcd(strongBinder9);
                }
                zzbo.zzc(parcel);
                getAppInstanceId(zzcdVar9);
                break;
            case zzbbs.zzt.zzm /* 21 */:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar8 = iInterfaceQueryLocalInterface10 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface10 : new zzcd(strongBinder10);
                }
                zzbo.zzc(parcel);
                getGmpAppId(zzcdVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar7 = iInterfaceQueryLocalInterface11 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface11 : new zzcd(strongBinder11);
                }
                zzbo.zzc(parcel);
                generateEventId(zzcdVar7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j20 = parcel.readLong();
                zzbo.zzc(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case 24:
                String string18 = parcel.readString();
                long j21 = parcel.readLong();
                zzbo.zzc(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                a aVarY4 = b.y(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityStarted(aVarY4, j22);
                break;
            case 26:
                a aVarY5 = b.y(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityStopped(aVarY5, j23);
                break;
            case 27:
                a aVarY6 = b.y(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityCreated(aVarY6, bundle5, j24);
                break;
            case 28:
                a aVarY7 = b.y(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityDestroyed(aVarY7, j25);
                break;
            case 29:
                a aVarY8 = b.y(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityPaused(aVarY8, j26);
                break;
            case 30:
                a aVarY9 = b.y(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityResumed(aVarY9, j27);
                break;
            case 31:
                a aVarY10 = b.y(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar6 = iInterfaceQueryLocalInterface12 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface12 : new zzcd(strongBinder12);
                }
                long j28 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivitySaveInstanceState(aVarY10, zzcdVar6, j28);
                break;
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                Bundle bundle6 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar5 = iInterfaceQueryLocalInterface13 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface13 : new zzcd(strongBinder13);
                }
                long j29 = parcel.readLong();
                zzbo.zzc(parcel);
                performAction(bundle6, zzcdVar5, j29);
                break;
            case 33:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                a aVarY11 = b.y(parcel.readStrongBinder());
                a aVarY12 = b.y(parcel.readStrongBinder());
                a aVarY13 = b.y(parcel.readStrongBinder());
                zzbo.zzc(parcel);
                logHealthData(i11, string19, aVarY11, aVarY12, aVarY13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar3 = iInterfaceQueryLocalInterface14 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface14 : new zzcg(strongBinder14);
                }
                zzbo.zzc(parcel);
                setEventInterceptor(zzcgVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar2 = iInterfaceQueryLocalInterface15 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface15 : new zzcg(strongBinder15);
                }
                zzbo.zzc(parcel);
                registerOnMeasurementEventListener(zzcgVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar = iInterfaceQueryLocalInterface16 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface16 : new zzcg(strongBinder16);
                }
                zzbo.zzc(parcel);
                unregisterOnMeasurementEventListener(zzcgVar);
                break;
            case 37:
                HashMap mapZzb = zzbo.zzb(parcel);
                zzbo.zzc(parcel);
                initForTests(mapZzb);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar4 = iInterfaceQueryLocalInterface17 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface17 : new zzcd(strongBinder17);
                }
                int i12 = parcel.readInt();
                zzbo.zzc(parcel);
                getTestFlag(zzcdVar4, i12);
                break;
            case 39:
                boolean zZzf6 = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                setDataCollectionEnabled(zZzf6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar3 = iInterfaceQueryLocalInterface18 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface18 : new zzcd(strongBinder18);
                }
                zzbo.zzc(parcel);
                isDataCollectionEnabled(zzcdVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                zzbo.zzc(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j30 = parcel.readLong();
                zzbo.zzc(parcel);
                clearMeasurementEnabled(j30);
                break;
            case 44:
                Bundle bundle8 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                zzbo.zzc(parcel);
                setConsent(bundle8, j31);
                break;
            case 45:
                Bundle bundle9 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                zzbo.zzc(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar2 = iInterfaceQueryLocalInterface19 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface19 : new zzcd(strongBinder19);
                }
                zzbo.zzc(parcel);
                getSessionId(zzcdVar2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
