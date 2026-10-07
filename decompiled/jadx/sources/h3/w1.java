package h3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import com.google.android.material.chip.ChipGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends androidx.fragment.app.s {
    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_menu_tools, viewGroup, false);
        ChipGroup chipGroup = (ChipGroup) viewInflate.findViewById(R.id.chipGroup);
        chipGroup.setOnCheckedChangeListener(new a5.a(this, 13));
        if (bundle == null) {
            u8.a aVar = chipGroup.f2402s;
            u8.h hVar = (u8.h) aVar.f8986a.get(Integer.valueOf(R.id.chipView01));
            if (hVar != null && aVar.a(hVar)) {
                aVar.d();
            }
        }
        return viewInflate;
    }

    public final void b0(androidx.fragment.app.s sVar) {
        androidx.fragment.app.i0 i0VarQ = q();
        i0VarQ.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0VarQ);
        aVar.k(R.id.viewContainer, sVar, null);
        aVar.e(false);
    }
}
