package lb;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements x9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6928a;

    public /* synthetic */ m(int i) {
        this.f6928a = i;
    }

    @Override // x9.e
    public Object d(x9.s sVar) {
        switch (this.f6928a) {
            case 0:
                return FirebaseSessionsRegistrar.m4getComponents$lambda0(sVar);
            case 7:
                return DatabaseRegistrar.lambda$getComponents$0(sVar);
            case 8:
                return AbtRegistrar.lambda$getComponents$0(sVar);
            default:
                return TransportRegistrar.lambda$getComponents$0(sVar);
        }
    }
}
