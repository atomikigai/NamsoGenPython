package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import q7.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j4) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j4) throws RemoteException;

    void endAdUnitExposure(String str, long j4) throws RemoteException;

    void generateEventId(zzcf zzcfVar) throws RemoteException;

    void getAppInstanceId(zzcf zzcfVar) throws RemoteException;

    void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException;

    void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException;

    void getCurrentScreenName(zzcf zzcfVar) throws RemoteException;

    void getGmpAppId(zzcf zzcfVar) throws RemoteException;

    void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException;

    void getSessionId(zzcf zzcfVar) throws RemoteException;

    void getTestFlag(zzcf zzcfVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z4, zzcf zzcfVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(a aVar, zzcl zzclVar, long j4) throws RemoteException;

    void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z10, long j4) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j4) throws RemoteException;

    void logHealthData(int i, String str, a aVar, a aVar2, a aVar3) throws RemoteException;

    void onActivityCreated(a aVar, Bundle bundle, long j4) throws RemoteException;

    void onActivityDestroyed(a aVar, long j4) throws RemoteException;

    void onActivityPaused(a aVar, long j4) throws RemoteException;

    void onActivityResumed(a aVar, long j4) throws RemoteException;

    void onActivitySaveInstanceState(a aVar, zzcf zzcfVar, long j4) throws RemoteException;

    void onActivityStarted(a aVar, long j4) throws RemoteException;

    void onActivityStopped(a aVar, long j4) throws RemoteException;

    void performAction(Bundle bundle, zzcf zzcfVar, long j4) throws RemoteException;

    void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException;

    void resetAnalyticsData(long j4) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j4) throws RemoteException;

    void setConsent(Bundle bundle, long j4) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j4) throws RemoteException;

    void setCurrentScreen(a aVar, String str, String str2, long j4) throws RemoteException;

    void setDataCollectionEnabled(boolean z4) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzci zzciVar) throws RemoteException;

    void setInstanceIdProvider(zzck zzckVar) throws RemoteException;

    void setMeasurementEnabled(boolean z4, long j4) throws RemoteException;

    void setMinimumSessionDuration(long j4) throws RemoteException;

    void setSessionTimeoutDuration(long j4) throws RemoteException;

    void setUserId(String str, long j4) throws RemoteException;

    void setUserProperty(String str, String str2, a aVar, boolean z4, long j4) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException;
}
