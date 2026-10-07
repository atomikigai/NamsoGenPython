package d5;

import android.app.Application;
import android.content.Intent;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends b {
    public c(Application application) {
        super(application);
    }

    public abstract void g(int i, int i10, Intent intent);

    public abstract void h(FirebaseAuth firebaseAuth, u4.c cVar, String str);
}
