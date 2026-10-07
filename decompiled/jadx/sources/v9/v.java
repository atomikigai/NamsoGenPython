package v9;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    private static final j7.a zza = new j7.a("PhoneAuthProvider", new String[0]);

    public void onCodeAutoRetrievalTimeOut(String str) {
        j7.a aVar = zza;
        Log.i(aVar.f5701a, aVar.d("Sms auto retrieval timed-out.", new Object[0]));
    }

    public abstract void onCodeSent(String str, u uVar);

    public abstract void onVerificationCompleted(t tVar);

    public abstract void onVerificationFailed(n9.h hVar);
}
