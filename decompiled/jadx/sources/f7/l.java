package f7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import z.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3644c;

    public l(Context context, XmlResourceParser xmlResourceParser) {
        this.f3644c = new ArrayList();
        this.f3643b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f3642a = typedArrayObtainStyledAttributes.getResourceId(index, this.f3642a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f3643b);
                this.f3643b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new z.m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public o3.e a() {
        o3.e eVar = new o3.e();
        eVar.f7495a = this.f3642a;
        eVar.f7496b = this.f3643b;
        eVar.f7497c = (String) this.f3644c;
        return eVar;
    }

    public synchronized int b() {
        int i = this.f3643b;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = ((Context) this.f3644c).getPackageManager();
        if (((Context) p7.c.a((Context) this.f3644c).f7823a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!n7.c.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f3643b = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f3643b = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (n7.c.h()) {
            this.f3643b = 2;
            i10 = 2;
        } else {
            this.f3643b = 1;
        }
        return i10;
    }

    public l() {
        this.f3644c = new l[256];
        this.f3642a = 0;
        this.f3643b = 0;
    }
}
