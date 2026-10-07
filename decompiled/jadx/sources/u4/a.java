package u4;

import android.os.Bundle;
import androidx.fragment.app.i0;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {
    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.FirebaseUI);
        setTheme(w().f8397d);
        if (w().f8406y) {
            setRequestedOrientation(1);
        }
    }

    public final void y(b bVar, String str, boolean z4, boolean z10) {
        i0 i0VarP = p();
        i0VarP.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0VarP);
        if (z4) {
            aVar.f818b = R.anim.fui_slide_in_right;
            aVar.f819c = R.anim.fui_slide_out_left;
            aVar.f820d = 0;
            aVar.e = 0;
        }
        aVar.k(R.id.fragment_register_email, bVar, str);
        if (z10) {
            aVar.c();
            aVar.e(false);
        } else {
            aVar.g();
            aVar.e(false);
        }
    }
}
