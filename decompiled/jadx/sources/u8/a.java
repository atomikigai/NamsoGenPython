package u8;

import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import com.google.android.material.chip.ChipGroup;
import h3.c0;
import h3.e0;
import h3.e1;
import h3.g0;
import h3.i1;
import h3.i2;
import h3.u2;
import h3.w1;
import h3.x;
import h3.z;
import h6.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8986a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f8987b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ib.c f8988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8989d;
    public boolean e;

    public final boolean a(h hVar) {
        int id2 = hVar.getId();
        Integer numValueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f8987b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        h hVar2 = (h) this.f8986a.get(Integer.valueOf(c()));
        if (hVar2 != null) {
            e(hVar2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f8987b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof h) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.f8989d) {
            return -1;
        }
        HashSet hashSet = this.f8987b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        ib.c cVar = this.f8988c;
        if (cVar != null) {
            new HashSet(this.f8987b);
            ChipGroup chipGroup = (ChipGroup) cVar.f5256b;
            n8.h hVar = chipGroup.f2401r;
            if (hVar != null) {
                chipGroup.f2402s.b(chipGroup);
                o0 o0Var = (o0) hVar;
                ChipGroup chipGroup2 = (ChipGroup) o0Var.f5062c;
                if (chipGroup2.f2402s.f8989d) {
                    n8.g gVar = (n8.g) o0Var.f5061b;
                    int checkedChipId = chipGroup2.getCheckedChipId();
                    w1 w1Var = (w1) ((a5.a) gVar).f185b;
                    if (checkedChipId == R.id.chipView01) {
                        w1Var.b0(new e1());
                        return;
                    }
                    if (checkedChipId == R.id.chipView02) {
                        w1Var.b0(new h3.b());
                        return;
                    }
                    if (checkedChipId == R.id.chipView04) {
                        w1Var.b0(new z());
                        return;
                    }
                    if (checkedChipId == R.id.chipView05) {
                        w1Var.b0(new i1());
                        return;
                    }
                    if (checkedChipId == R.id.chipView06) {
                        w1Var.b0(new g0());
                        return;
                    }
                    if (checkedChipId == R.id.chipView07) {
                        w1Var.b0(new e0());
                        return;
                    }
                    if (checkedChipId == R.id.chipView08) {
                        w1Var.b0(new x());
                        return;
                    }
                    if (checkedChipId == R.id.chipView09) {
                        w1Var.b0(new c0());
                    } else if (checkedChipId == R.id.chipView10) {
                        w1Var.b0(new i2());
                    } else if (checkedChipId == R.id.chipView12) {
                        w1Var.b0(new u2());
                    }
                }
            }
        }
    }

    public final boolean e(h hVar, boolean z4) {
        int id2 = hVar.getId();
        Integer numValueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f8987b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z4 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            hVar.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id2));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return zRemove;
    }
}
