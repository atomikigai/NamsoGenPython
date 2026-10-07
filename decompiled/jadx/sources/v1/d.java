package v1;

import android.app.Service;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.zzr;
import java.util.ArrayDeque;
import java.util.List;
import q0.s;
import x1.h0;
import x1.h1;
import x1.i0;
import x1.w0;
import z7.a1;
import z7.c3;
import z7.n2;
import z7.v0;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e, h1, zzr, c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9128a;

    public /* synthetic */ d(Object obj) {
        this.f9128a = obj;
    }

    @Override // x1.h1
    public int a(View view) {
        return (view.getLeft() - ((i0) view.getLayoutParams()).f10106b.left) - ((ViewGroup.MarginLayoutParams) ((i0) view.getLayoutParams())).leftMargin;
    }

    @Override // x1.h1
    public int b() {
        return ((h0) this.f9128a).C();
    }

    @Override // x1.h1
    public int c() {
        h0 h0Var = (h0) this.f9128a;
        return h0Var.f10092n - h0Var.D();
    }

    @Override // x1.h1
    public View d(int i) {
        return ((h0) this.f9128a).u(i);
    }

    @Override // v1.e
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // v1.e
    public void f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f9128a).setResultCode(i);
    }

    @Override // x1.h1
    public int g(View view) {
        return view.getRight() + ((i0) view.getLayoutParams()).f10106b.right + ((ViewGroup.MarginLayoutParams) ((i0) view.getLayoutParams())).rightMargin;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public void h(w0 w0Var, s sVar, s sVar2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.f9128a;
        recyclerView.getClass();
        w0Var.n(false);
        x1.i iVar = (x1.i) recyclerView.f1132a0;
        if (sVar != null) {
            iVar.getClass();
            int i = sVar.f7938a;
            int i10 = sVar2.f7938a;
            if (i == i10 && sVar.f7939b == sVar2.f7939b) {
                iVar.l(w0Var);
                w0Var.f10230a.setAlpha(0.0f);
                iVar.i.add(w0Var);
                zG = true;
            } else {
                zG = iVar.g(w0Var, i, sVar.f7939b, i10, sVar2.f7939b);
            }
        } else {
            iVar.l(w0Var);
            w0Var.f10230a.setAlpha(0.0f);
            iVar.i.add(w0Var);
            zG = true;
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public void i(w0 w0Var, s sVar, s sVar2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.f9128a;
        recyclerView.f1135c.l(w0Var);
        recyclerView.h(w0Var);
        w0Var.n(false);
        x1.i iVar = (x1.i) recyclerView.f1132a0;
        iVar.getClass();
        int i = sVar.f7938a;
        int i10 = sVar.f7939b;
        View view = w0Var.f10230a;
        int left = sVar2 == null ? view.getLeft() : sVar2.f7938a;
        int top = sVar2 == null ? view.getTop() : sVar2.f7939b;
        if (w0Var.h() || (i == left && i10 == top)) {
            iVar.l(w0Var);
            iVar.h.add(w0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = iVar.g(w0Var, i, i10, left, top);
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public z7.i0 j() {
        z7.i0 i0Var = a1.m((Service) this.f9128a, null, null).f11007t;
        a1.f(i0Var);
        return i0Var;
    }

    @Override // z7.c3
    public void zza(String str, Bundle bundle) {
        z2 z2Var = (z2) this.f9128a;
        if (!TextUtils.isEmpty(str)) {
            z2Var.zzaB().l(new n2(this, str, bundle));
            return;
        }
        a1 a1Var = z2Var.f11517w;
        if (a1Var != null) {
            z7.i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c("_err", "AppId not known when logging event");
        }
    }

    public d() {
        this.f9128a = new ArrayDeque();
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public void zza(int i, String str, List list, boolean z4, boolean z10) {
        fd.b bVar;
        v0 v0Var = (v0) this.f9128a;
        int i10 = i - 1;
        if (i10 == 0) {
            z7.i0 i0Var = ((a1) v0Var.f159a).f11007t;
            a1.f(i0Var);
            bVar = i0Var.f11197x;
        } else if (i10 != 1) {
            if (i10 == 3) {
                z7.i0 i0Var2 = ((a1) v0Var.f159a).f11007t;
                a1.f(i0Var2);
                bVar = i0Var2.f11198y;
            } else if (i10 != 4) {
                z7.i0 i0Var3 = ((a1) v0Var.f159a).f11007t;
                a1.f(i0Var3);
                bVar = i0Var3.f11196w;
            } else if (z4) {
                z7.i0 i0Var4 = ((a1) v0Var.f159a).f11007t;
                a1.f(i0Var4);
                bVar = i0Var4.f11194u;
            } else if (!z10) {
                z7.i0 i0Var5 = ((a1) v0Var.f159a).f11007t;
                a1.f(i0Var5);
                bVar = i0Var5.f11195v;
            } else {
                z7.i0 i0Var6 = ((a1) v0Var.f159a).f11007t;
                a1.f(i0Var6);
                bVar = i0Var6.f11193t;
            }
        } else if (z4) {
            z7.i0 i0Var7 = ((a1) v0Var.f159a).f11007t;
            a1.f(i0Var7);
            bVar = i0Var7.f11191r;
        } else if (!z10) {
            z7.i0 i0Var8 = ((a1) v0Var.f159a).f11007t;
            a1.f(i0Var8);
            bVar = i0Var8.f11192s;
        } else {
            z7.i0 i0Var9 = ((a1) v0Var.f159a).f11007t;
            a1.f(i0Var9);
            bVar = i0Var9.f11190f;
        }
        int size = list.size();
        if (size == 1) {
            bVar.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            bVar.d(list.get(0), str, list.get(1));
        } else if (size != 3) {
            bVar.b(str);
        } else {
            bVar.e(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
