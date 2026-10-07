package c1;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.f1719a = context;
        this.f1720b = cVar;
    }

    @Override // ic.a
    public final Object a() {
        Context context = this.f1719a;
        jc.i.d(context, "applicationContext");
        String str = this.f1720b.f1721a;
        jc.i.e(str, "name");
        String strH = jc.i.h(".preferences_pb", str);
        jc.i.e(strH, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), jc.i.h(strH, "datastore/"));
    }
}
