package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5857b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5859d;
    public final LayoutInflater e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5860f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z4, int i) {
        this.f5859d = z4;
        this.e = layoutInflater;
        this.f5856a = lVar;
        this.f5860f = i;
        a();
    }

    public final void a() {
        l lVar = this.f5856a;
        n nVar = lVar.G;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f5869u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n) arrayList.get(i)) == nVar) {
                    this.f5857b = i;
                    return;
                }
            }
        }
        this.f5857b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i) {
        ArrayList arrayListL;
        boolean z4 = this.f5859d;
        l lVar = this.f5856a;
        if (z4) {
            lVar.i();
            arrayListL = lVar.f5869u;
        } else {
            arrayListL = lVar.l();
        }
        int i10 = this.f5857b;
        if (i10 >= 0 && i >= i10) {
            i++;
        }
        return (n) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z4 = this.f5859d;
        l lVar = this.f5856a;
        if (z4) {
            lVar.i();
            arrayListL = lVar.f5869u;
        } else {
            arrayListL = lVar.l();
        }
        return this.f5857b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.e.inflate(this.f5860f, viewGroup, false);
        }
        int i10 = getItem(i).f5879b;
        int i11 = i - 1;
        int i12 = i11 >= 0 ? getItem(i11).f5879b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f5856a.m() && i10 != i12) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        z zVar = (z) view;
        if (this.f5858c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
