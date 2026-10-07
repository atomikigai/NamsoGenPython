package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5849a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f5850b;

    public g(h hVar) {
        this.f5850b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f5850b.f5853c;
        n nVar = lVar.G;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f5869u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n) arrayList.get(i)) == nVar) {
                    this.f5849a = i;
                    return;
                }
            }
        }
        this.f5849a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i) {
        h hVar = this.f5850b;
        l lVar = hVar.f5853c;
        lVar.i();
        ArrayList arrayList = lVar.f5869u;
        hVar.getClass();
        int i10 = this.f5849a;
        if (i10 >= 0 && i >= i10) {
            i++;
        }
        return (n) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f5850b;
        l lVar = hVar.f5853c;
        lVar.i();
        int size = lVar.f5869u.size();
        hVar.getClass();
        return this.f5849a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5850b.f5852b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
